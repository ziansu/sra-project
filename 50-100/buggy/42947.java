@java.lang.Override
public java.lang.String register(com.corebanking.dto.NewAccountRegDTO dto) {
    com.corebanking.domain.NewAccountRegBO bo = null;
    bo = new com.corebanking.domain.NewAccountRegBO();
    org.springframework.beans.BeanUtils.copyProperties(dto, bo);
    java.lang.Long id = 0L;
    id = dao.saveNewCustomerData(bo);
    if (id > 0)
        return (("Your Information Registered SuccessFully.. With Account Number  " + id) + "--") + (bo.getADDRS());
    else
        return "Registration Failed";
    
}