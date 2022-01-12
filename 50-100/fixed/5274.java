@java.lang.Override
public fr.gwombat.predicadmin.web.vo.ContactDetailVO toViewObject(final fr.gwombat.predicadmin.model.ContactDetail contactDetail) {
    fr.gwombat.predicadmin.web.vo.builder.ContactDetailVoBuilder builder = fr.gwombat.predicadmin.web.vo.builder.ContactDetailVoBuilder.begin();
    if (contactDetail != null)
        builder = fr.gwombat.predicadmin.web.vo.builder.ContactDetailVoBuilder.begin().email(contactDetail.getEmail()).mobilePhone(fr.gwombat.predicadmin.web.transformer.ContactDetailTransformer.formatPhoneNumber(contactDetail.getMobilePhone())).phone(fr.gwombat.predicadmin.web.transformer.ContactDetailTransformer.formatPhoneNumber(contactDetail.getPhone()));
    
    return builder.build();
}