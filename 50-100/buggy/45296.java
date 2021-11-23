@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.button :
            myTimer.start(textView);
            break;
        case R.id.button2 :
            myTimer.pause();
            break;
        case R.id.button3 :
            myTimer.stop(textView);
            break;
    }
}