public static java.util.function.Predicate<com.amazon.proposalcalculator.bean.Price> licenceModel(com.amazon.proposalcalculator.bean.InstanceInput server) {
    return ( p) -> ((p.getLicenseModel()) != null) && (p.getLicenseModel().equalsIgnoreCase(("Windows".equals(server.getOperatingSystem()) ? "License Included" : "No License required")));
}