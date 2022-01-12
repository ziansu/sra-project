public int write(int size, java.lang.String data) throws files.invalid_operation {
    if (rwx.equals(mode.read_only))
        throw new files.files.invalid_operation();
    
    if (rwx.equals(mode.write_append)) {
        ws.append(data);
    }else
        if (rwx.equals(mode.write_trunc)) {
            ws.write(data);
        }
    
    sw.write(content);
    sw.write(data, offset, size);
    content = sw.toString();
    return size;
}