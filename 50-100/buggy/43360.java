public boolean updatePredicate(android.text.Editable s, int viewId) {
    com.example.godsi.myapplication.Constant cons = ((com.example.godsi.myapplication.Constant) (getParameter(viewId)));
    if (!(cons.value.equalsIgnoreCase(s.toString()))) {
        cons.value = s.toString();
        setValidity();
        return true;
    }
    return false;
}