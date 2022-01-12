@java.lang.Override
public tr.edu.hacettepe.document.Document next() {
    document = nextDoc();
    tr.edu.hacettepe.document.Document tmp = document;
    return tmp;
}