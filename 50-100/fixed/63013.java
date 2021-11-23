public java.lang.String choicesToString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(make);
    sb.append(" ");
    sb.append(model);
    sb.append("\n");
    for (model.OptionSet set : userChoice) {
        sb.append(set.getName());
        sb.append(": ");
        sb.append(getOptionChoice(set.getName()));
        sb.append("\n");
    }
    return sb.toString();
}