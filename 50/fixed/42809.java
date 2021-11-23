public java.lang.String getIncorrectAnswer1() {
    int val = (firstExpression.number) / (secondExpression.number);
    int comma = (firstExpression.comma) + (secondExpression.comma);
    return new com.example.stacjonarny.graulamki.Classes.MyNumber(val, comma).toString();
}