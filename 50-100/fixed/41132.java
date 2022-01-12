public static void main(java.lang.String[] args) {
    java.lang.System.out.println(HelloWorld.HELLO_WORLD);
    WorldObject france = new WorldObject("France", "Europa");
    WorldObject germany = new WorldObject("Germany", "Europa");
    HelloWorld.print(france);
    HelloWorld.print(germany);
}