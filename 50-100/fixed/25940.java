public void setSelectionByValue(java.lang.String value) {
    if ((items) != null) {
        for (int i = 0; i < (items.size()); i++) {
            java.lang.String item = items.get(i);
            if (value.equals(item)) {
                setSelectionByIndex((i - 1));
                return ;
            }
        }
    }
}