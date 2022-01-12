private static final org.jooq.impl.ParserImpl.Sign parseSign(org.jooq.impl.ParserImpl.ParserContext ctx) {
    org.jooq.impl.ParserImpl.Sign sign = org.jooq.impl.ParserImpl.Sign.NONE;
    for (; ;)
        if (org.jooq.impl.ParserImpl.parseIf(ctx, '+'))
            sign = (sign == null) ? org.jooq.impl.ParserImpl.Sign.PLUS : sign.invert();
        else
            if (org.jooq.impl.ParserImpl.parseIf(ctx, '-'))
                sign = (sign == null) ? org.jooq.impl.ParserImpl.Sign.MINUS : sign.invert();
            else
                break;
            
        
    
    return sign;
}