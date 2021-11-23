@org.springframework.context.annotation.Bean
public com.amazonaws.services.s3.AmazonS3 s3Client() {
    com.amazonaws.auth.AWSCredentials awsCredentials = new com.amazonaws.auth.BasicAWSCredentials(null, null);
    com.amazonaws.services.s3.AmazonS3 s3Client = new com.amazonaws.services.s3.AmazonS3Client(awsCredentials);
    return s3Client;
}