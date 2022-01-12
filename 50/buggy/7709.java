public boolean getButton(java.lang.String name) {
    if (buttonNames_.containsKey(name))
        return buttons_.get(name).state;
    
}