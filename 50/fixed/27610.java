public static void main(java.lang.String[] args) {
    JsonConverter.Human human = new JsonConverter.Human("Ivan", "Ivan", 18);
    JsonConverter.Converter converter = new JsonConverter.Converter();
    java.lang.System.out.println(converter.convert(human));
}