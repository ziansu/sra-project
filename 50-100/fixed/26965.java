private void falseChecker() {
    feedback.setVisibility(View.VISIBLE);
    invisibleTimer.cancel();
    if ((project.equationinvasion.Play.mathGen.getAnswer()) != (project.equationinvasion.Play.mathGen.getEquation())) {
        feedback.setImageResource(R.drawable.checkmark);
        scoreCounter();
        pipChanger();
    }else {
        feedback.setImageResource(R.drawable.x);
        streak = 0;
        pipChanger();
    }
    invisibleTimer.start();
}