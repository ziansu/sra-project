private int findComponentStart(int findFrom, com.epam.java.rt.lab.parser.service.Type type) {
    java.util.regex.Matcher matcher = ruler.getTypeRulePatternStart(type).matcher(this.source);
    if (!(matcher.find(findFrom)))
        return -1;
    
    java.lang.System.out.println(((((("findFrom=" + findFrom) + ", type=") + type) + ", matcher.start()=") + (matcher.start())));
    return matcher.start();
}