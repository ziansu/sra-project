@java.lang.Override
public scala.Tuple2<java.lang.String, scala.Tuple3<java.lang.String, java.lang.Double, java.lang.Double>> call(scala.Tuple2<java.lang.String, scala.Tuple2<scala.Tuple2<java.lang.String, java.lang.Double>, java.lang.Double>> arg0) throws java.lang.Exception {
    return new scala.Tuple2<java.lang.String, scala.Tuple3<java.lang.String, java.lang.Double, java.lang.Double>>(arg0._2._1._1, new scala.Tuple3(arg0._1, arg0._2._1._2, arg0._2._2));
}