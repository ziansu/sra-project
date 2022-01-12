@java.lang.Override
public tr.edu.hacettepe.document.Document next() {
    tr.edu.hacettepe.document.Document tmp = document;
    document = nextDoc();
    (index)++;
    return tmp;
}