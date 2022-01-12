public void writeTextArea(java.lang.String[] params) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < ((params.length) - 2); i++)
        sb.append(params[i]).append("\n");
    
    jTextArea1.append(sb.toString());
}