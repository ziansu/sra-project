@org.junit.Test
public void testMethod2() {
    addMockFile("$A/java/util/Vector.jml", "package java.util;\npublic class Vector<E> extends java.util.AbstractList<E> implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable { \npublic <T> T[] toArray(T[] t); }");
    helpTCF("A.java", "public class A<X> { java.util.Vector<X> t; }");
}