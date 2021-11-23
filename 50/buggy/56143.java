public int randomGenerator() {
    java.lang.System.out.println(("the random data size is " + (randomDataSize)));
    return generator.nextInt(randomDataSize);
}