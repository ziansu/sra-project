public int getvariable(java.lang.String name) {
    for (int i = 0; i < (labels.length); i++) {
        if ((labels[i].name) == name)
            return labels[i].line;
        
    }
    return 0;
}