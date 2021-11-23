public void setTypedText(java.lang.String typedText) {
    this.typedText = typedText;
    java.lang.System.out.println(typedText);
    if ((typedText.length()) == 3) {
        typedCharCountIsThree(typedText);
    }else
        if ((typedText.length()) > 3) {
            setUserFiltered(filterUser(typedText));
        }else {
            setUserFiltered(new java.util.ArrayList<UserWrapper>());
        }
    
}