@java.lang.Override
protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
    Data.Atividade c = new Data.Atividade(((java.util.GregorianCalendar) (date.clone())), user, atividade);
    return c;
}