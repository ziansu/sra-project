@java.lang.Override
public boolean matches(java.lang.Integer tpic) {
    boolean result = true;
    java.lang.Integer[] tpicChilds = treelang.TStorage.gI().get(tpic).getArgs();
    for (int i = 0; i < (children.length); i++) {
        if (!(children[i].matches(tpicChilds[i])))
            result = false;
        
    }
    return result;
}