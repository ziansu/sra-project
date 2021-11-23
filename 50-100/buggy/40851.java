private java.lang.String calc(java.lang.String input) {
    edu.gatech.oad.antlab.person.Stringbuilder str = new edu.gatech.oad.antlab.person.Stringbuilder(input);
    str.append(input.substring(0, 2));
    str.deleteCharAt(0);
    str.deleteCharAt(0);
    return str.toString();
}