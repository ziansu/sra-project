public static com.seal.keyboard.KeyMap<java.lang.Character, java.lang.String> loadKeyMap(java.util.stream.Stream<java.lang.String> stream) {
    java.util.Map<java.lang.Character, java.lang.String> map = stream.map(( i) -> i.trim().split(" ")).filter(com.seal.keyboard.Init.check).collect(java.util.stream.Collectors.toMap(( i) -> i[0].charAt(0), ( i) -> i[1]));
    return new com.seal.keyboard.KeyMap(map);
}