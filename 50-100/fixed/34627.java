private boolean isAddressMapped(de.upb.llvm_parser.llvm.Address address, java.util.List<de.upb.lina.cfg.gendata.AddressMapping> mapping) {
    for (de.upb.lina.cfg.gendata.AddressMapping am : mapping) {
        for (de.upb.llvm_parser.llvm.Address a : am.getAdresses()) {
            if (a.getName().equals(address.getName())) {
                return true;
            }
        }
    }
    return false;
}