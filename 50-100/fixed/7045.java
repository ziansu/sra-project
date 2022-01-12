@org.junit.Test
public void map_should_map_numbers_to_itself_on_providing_ItselfMapper() {
    java.util.List<java.lang.Integer> numbers = new java.util.ArrayList<java.lang.Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    ListMapper mapper = new IdentityMapper();
    java.util.List<java.lang.Integer> result = CollectionUtils.map(numbers, mapper);
    assertEquals(numbers, result);
}