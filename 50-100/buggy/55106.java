private void randomiseMissingSquare() {
    missingSquare = new java.awt.Rectangle(((int) ((java.lang.Math.random()) * (ChapterExercise5_1And5_2.TilingFrame.NUMBER_OF_CELLS))), ((int) ((java.lang.Math.random()) * (ChapterExercise5_1And5_2.TilingFrame.NUMBER_OF_CELLS))), 1, 1);
    repaint();
}