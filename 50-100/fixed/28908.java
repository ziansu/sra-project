public boolean isAdditionAnswerCorrect(int ax, int b, int cx, int d) {
    android.util.Log.d(com.freelance.jptalusan.algeops.Utilities.Equation.TAG, "isAdditionAnswerCorrect");
    return ((((this.ax) == ax) && ((this.cx) == cx)) && ((this.b) == b)) && ((this.d) == d);
}