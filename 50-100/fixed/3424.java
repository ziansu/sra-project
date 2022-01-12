public java.util.List<type.Fbq> calculateALL(java.lang.Integer number) {
    java.util.List<type.Fbq> results = new java.util.ArrayList<type.Fbq>(number);
    for (int i = 1; i <= number; i++) {
        results.add(new type.Fbq(i, validatorRules.computeNumber(i)));
    }
    return results;
}