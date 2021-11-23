@java.lang.Override
public boolean sendContactMessage(@org.apache.ibatis.annotations.Param(value = "name")
java.lang.String name, @org.apache.ibatis.annotations.Param(value = "email")
java.lang.String email, @org.apache.ibatis.annotations.Param(value = "message")
java.lang.String message) {
    if ((contactMessageMapper.checkContactMessage(email)) == 0) {
        print("���ݿⲻ�����������");
        contactMessageMapper.saveContactMessage(name, email, message);
        return true;
    }else {
        print("���ݿ�����������");
        return false;
    }
}