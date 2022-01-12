public void setName(java.lang.String name_string) {
    for (int i = 0; i < (array_size); ++i) {
        names.add((((name_string + '[') + ((indexOffset) + i)) + ']'));
        array_elements.get(i).setName(names.get(i));
    }
}