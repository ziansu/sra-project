public static taphdi.HDITapEntry read(java.lang.String source) throws java.lang.IllegalArgumentException {
    java.lang.String[] part = source.split(";");
    if ((part.length) != 3)
        throw new java.lang.IllegalArgumentException(("Invalid HDITapEntry source: " + source));
    
    taphdi.HDITapEntry result = new taphdi.HDITapEntry();
    result.setYear(java.lang.Integer.parseInt(part[0]));
    result.setHdi(java.lang.Double.parseDouble(part[1]));
    result.setTapPrevalence(java.lang.Double.parseDouble(part[2]));
    return result;
}