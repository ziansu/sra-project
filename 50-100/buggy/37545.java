private void initializeVariables() {
    complimentsArray = getResources().getStringArray(R.array.compliments_string_array);
    complimentsSize = complimentsArray.length;
    randomGen = new java.util.Random();
    complimentIndex = randomGen.nextInt(complimentsSize);
    compliment = complimentsArray[complimentIndex];
    lightColorArray = getResources().getStringArray(R.array.light_colors);
    colorsSize = lightColorArray.length;
    colorIndex = randomGen.nextInt(colorsSize);
    currentColor = lightColorArray[colorIndex];
}