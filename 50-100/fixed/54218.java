private static java.util.List<com.expertsoft.model.Phone> createPhoneList(int count) {
    java.util.List<com.expertsoft.model.Phone> phones = new java.util.ArrayList<>();
    for (int i = 0; i < count; i++) {
        phones.add(new com.expertsoft.model.Phone(("iPhone" + i), "black", 4, java.math.BigDecimal.valueOf(800)));
    }
    return phones;
}