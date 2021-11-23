private int findComponentStart(int findFrom, com.epam.java.rt.lab.parser.service.Type type) {
    java.util.regex.Matcher matcher = ruler.getTypeRulePatternStart(type).matcher(this.source);
    if (!(matcher.find(findFrom)))
        return -1;
    
    return matcher.start();
}