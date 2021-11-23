public java.lang.String generateGibberish(int length) {
    for (int i = 0; i < length; i++) {
        sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
        result = sb.toString();
    }
    java.lang.System.out.println(result);
    return result;
}