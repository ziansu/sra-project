private void showCorrectImage(int correctButton) {
    isOnTouchKeyOn = false;
    imgExOneQuestion.startAnimation(animScaleOut);
    if (correctButton == (ua.com.spasetv.testintuitions.FragExerciseOne.MOON_BUTTON)) {
        imgExOneQuestion.setImageResource(R.drawable.ic_brightness_2_black_48dp);
    }else
        if (correctButton == (ua.com.spasetv.testintuitions.FragExerciseOne.SUN_BUTTON)) {
            imgExOneQuestion.setImageResource(R.drawable.ic_brightness_5_black_48dp);
        }
    
    imgExOneQuestion.startAnimation(animScaleIn);
    if (isLastQuestion)
        imgExOneQuestion.startAnimation(animPause);
    
}