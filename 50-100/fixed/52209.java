@java.lang.Override
public void onClick(android.view.View v) {
    if ((selectedColors.size()) > 0) {
        final com.jpsappclub.exampleapp.Color result = com.jpsappclub.exampleapp.ColorCalculator.addColors(selectedColors);
        resultView.setBackgroundColor(android.graphics.Color.rgb(result.getRed(), result.getGreen(), result.getBlue()));
        selectedColors.clear();
        redSelected = false;
        greenSelected = false;
        blueSelected = false;
        yellowSelected = false;
        cyanSelected = false;
        pinkSelected = false;
    }
}