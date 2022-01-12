@java.lang.Override
public void push(T o) {
    m_parsedObjects.add(o);
    super.push(o);
}