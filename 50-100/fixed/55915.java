protected void generalOfIconButton(java.lang.String[] array) {
    for (int i = 0; i < (array.length); i++) {
        button = new android.widget.Button(getContext());
        button.setBackgroundResource(getIdResources(array[i], "mipmap"));
        button.setTag(array[i]);
        button.setOnClickListener(this);
        gridLayout.addView(button);
    }
}