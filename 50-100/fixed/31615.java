public void Readtopicscore(java.lang.String filename) {
    try {
        java.util.Scanner sc = new java.util.Scanner(new java.io.File(filename));
        while (sc.hasNext()) {
            topicscores.add(sc.nextDouble());
        } 
    } catch (java.io.FileNotFoundException ex) {
        java.util.logging.Logger.getLogger(edu.isi.techknacq.topics.graph.Comparisononalledges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}