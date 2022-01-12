private void countOccurrences() {
    synchronized(this) {
        int occurrences = 0;
        java.util.Iterator<org.eclipse.jface.text.source.Annotation> iter = fAnnotationModel.getAnnotationIterator();
        while (iter.hasNext()) {
            org.eclipse.jface.text.source.Annotation annotation = iter.next();
            if (org.eclipse.jdt.text.tests.MarkOccurrenceTest.OCCURRENCE_ANNOTATION.equals(annotation.getType()))
                occurrences++;
            
            if (org.eclipse.jdt.text.tests.MarkOccurrenceTest.OCCURRENCE_WRITE_ANNOTATION.equals(annotation.getType()))
                occurrences++;
            
        } 
        fOccurrences = occurrences;
    }
}