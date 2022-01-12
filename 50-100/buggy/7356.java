@java.lang.Override
public N next() {
    if ((((data.size()) - 1) < (i)) || ((data.get(i)) == null))
        data.add(getRandomValue());
    
    return data.get(((i)++));
}