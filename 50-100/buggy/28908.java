public boolean isAdditionAnswerCorrect(int ax, int b, int cx, int d) {
    android.util.Log.d(com.freelance.jptalusan.algeops.Utilities.Equation.TAG, "isAdditionAnswerCorrect");
    return (((this.ax) + (this.cx)) == (ax + cx)) && (((this.b) + (this.d)) == (b + d));
}