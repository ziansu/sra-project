@java.lang.Override
public int compare(scala.Tuple2<java.lang.Double, scala.Tuple2<java.lang.Integer, java.util.List<java.lang.Integer>>> score_1, scala.Tuple2<java.lang.Double, scala.Tuple2<java.lang.Integer, java.util.List<java.lang.Integer>>> score_2) {
    if ((score_1._1) < (score_2._1))
        return -1;
    
    if ((score_1._1) > (score_2._1))
        return 1;
    
    return 0;
}