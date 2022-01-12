@java.lang.Override
public int compare(float[] o1, float[] o2) {
    int answer = ((int) (java.lang.Math.signum(((o1[0]) - (o2[0])))));
    return answer;
}