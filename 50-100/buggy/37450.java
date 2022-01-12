@java.lang.Override
public int compare(WikiWordInfoEntry o1, WikiWordInfoEntry o2) {
    float x = (o1.tf) * (_idf);
    float y = (o2.tf) * (_idf);
    return (-1) * (x < y ? -1 : x == y ? 0 : 1);
}