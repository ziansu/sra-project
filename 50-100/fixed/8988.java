private void fillTextLineBoxes() {
    if (!(lines.isEmpty())) {
        java.lang.String[] fields = lines.get(0).split(fieldSeparator.getText(), (-1));
        lineBoxes.stream().forEach(( b) -> {
            b.addItem("Select field");
            java.util.Arrays.stream(fields).forEach(( f) -> b.addItem(f));
        });
    }
}