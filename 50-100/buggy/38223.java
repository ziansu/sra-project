@java.lang.Override
public fr.gwombat.predicadmin.web.vo.AddressVO toViewObject(final fr.gwombat.predicadmin.model.Address address) {
    if (address != null) {
        final fr.gwombat.predicadmin.web.vo.builder.AddressVoBuilder builder = fr.gwombat.predicadmin.web.vo.builder.AddressVoBuilder.begin().city(address.getCity()).country(address.getCountry()).street(fr.gwombat.predicadmin.web.transformer.AddressTransformer.computeAddress(address)).zip(address.getZip());
        return builder.build();
    }
    return null;
}