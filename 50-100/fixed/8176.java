public java.util.List<org.todss.model.IntakeMoment> test(org.todss.algorithm.AlgorithmContext context) {
    final long start = java.lang.System.currentTimeMillis();
    final java.util.List<org.todss.model.IntakeMoment> list = org.todss.algorithm.SmartAlgorithm.run(context);
    java.lang.System.out.println((("Took " + ((java.lang.System.currentTimeMillis()) - start)) + " ms."));
    assert (list != null) && ((list.size()) > 0);
    return list;
}