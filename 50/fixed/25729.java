@java.lang.Override
public boolean validate(com.company.Domain.Post p) {
    if ((p.getId()) < 0)
        return false;
    
    return true;
}