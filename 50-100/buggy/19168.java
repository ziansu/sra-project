@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    if ((audioPlayerService) != null) {
        switch (checkedId) {
            case R.id.noiseTypeWhite :
                audioPlayerService.setSoundFile(R.raw.white);
                break;
            case R.id.noiseTypePink :
                audioPlayerService.setSoundFile(R.raw.pink);
                break;
            case R.id.noiseTypeBrown :
                audioPlayerService.setSoundFile(R.raw.brown);
                break;
        }
    }
}