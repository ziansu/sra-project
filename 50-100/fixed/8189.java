protected int put(final bee.creative.iam.IAMEncoder.IAMBaseListEncoder list) throws java.lang.NullPointerException {
    if (list == null)
        throw new java.lang.NullPointerException();
    
    final int result = this.lists.size();
    this.lists.add(result, list);
    return result;
}