@java.lang.Override
public void update(long readedBytes, long totalBytes, int currentItem) {
    java.lang.System.out.println(((((("当前已处理：" + readedBytes) + "-----------文件大小为：") + totalBytes) + "--") + currentItem));
}